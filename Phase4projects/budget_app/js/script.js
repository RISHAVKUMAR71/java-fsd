// Custom Loader Element Node
var loader = document.createElement('div')
loader.setAttribute('id', 'pre-loader');
loader.innerHTML = "<div class='lds-hourglass'></div>";

// Loader Start Function
window.start_loader = function() {
    if (!document.getElementById('pre-loader') || (!!document.getElementById('pre-loader') && document.getElementById('pre-loader').length <= 0))
        document.querySelector('body').appendChild(loader)
}

// Loader Stop Function
window.end_loader = function() {
    if (!!document.getElementById('pre-loader')) {
        setTimeout(() => {
            document.getElementById('pre-loader').remove()
        }, 500)
    }
}

function load_summary() {
    var wallet = !!localStorage.getItem('wallet') ? localStorage.getItem('wallet') : 0;
    var expenses = !!localStorage.getItem('expenses') ? $.parseJSON(localStorage.getItem('expenses')) : {};
    $('.wallet-amount').text(parseFloat(wallet).toLocaleString('en-US'))
    var total_expense = 0
    var total_balance = 0
    if (Object.keys(expenses).length > 0) {
        Object.keys(expenses).map(k => {
            console.log(expenses[k])
            total_expense += parseFloat(expenses[k].amount)
        })
    }
    $('.expense-amount').text(parseFloat(total_expense).toLocaleString('en-US'))
    $('.balance-amount').text(parseFloat(parseFloat(wallet) - parseFloat(total_expense)).toLocaleString('en-US'))

}

function load_expenses() {
    var expenses = !!localStorage.getItem('expenses') ? $.parseJSON(localStorage.getItem('expenses')) : {};
    $('#expense-list').html('')
    if (Object.keys(expenses).length > 0) {
        Object.keys(expenses).map(k => {
            var data = expenses[k]
            var item = $($('noscript#exp-item-clone').html()).clone()
            item.find('.expName').text(data.name)
            item.find('.expAmount').text(parseFloat(data.amount).toLocaleString())
            $('#expense-list').append(item)
            item.find('.edit-expense').click(function() {
                var editModal = $('#editExpenseModal')
                editModal.find('[name="id"]').val(data.id)
                editModal.find('[name="expense_name"]').val(data.name)
                editModal.find('[name="amount"]').val(data.amount)
                editModal.modal('show')
                editModal.on('shown.bs.modal', function() {
                    editModal.find('[name="amount"]').trigger('focus')
                })
            })
            item.find('.delete-expense').click(function() {
                if (confirm("Are you sure to delete " + data.name + " from Expense List?") === true) {
                    var expobj = !!localStorage.getItem('expenses') ? $.parseJSON(localStorage.getItem('expenses')) : {}
                    delete expobj[data.id]
                    localStorage.setItem('expenses', JSON.stringify(expobj));
                    alert("Expense has been deleted successfully.");
                    location.reload();
                    end_loader()
                }
            })
        })
    }
}
$(function() {
    end_loader();
    load_summary()
    load_expenses()
    $('#wallet-btn').click(function() {
        $('#walletModal').modal('show')
    })

    $('#walletModal').on('shown.bs.modal', function() {
        var wallet = !!localStorage.getItem('wallet') ? localStorage.getItem('wallet') : 0;
        $('#wallet-amount').val(wallet).trigger('focus')
    })

    $('#wallet-form').submit(function(e) {
        e.preventDefault()
        start_loader()
        localStorage.setItem('wallet', $('#wallet-amount').val())
        alert("Wallet has been updated.")
        location.reload()
    })

    $('#new-expense-btn').click(function() {
        $('#addExpenseModal').modal('show')
    })
    $('#addExpenseModal').on('shown.bs.modal', function() {
        $(this).find('input').first().focus()
    })
    $('#new-expense-form').submit(function(e) {
        e.preventDefault()
        var _this = $(this)
        var expenses = !!localStorage.getItem('expenses') ? $.parseJSON(localStorage.getItem('expenses')) : {}
        var exp_obj = {}
        if (Object.keys(expenses).length > 0) {
            Object.keys(expenses).map(function(k) {
                exp_obj[expenses[k].id] = expenses[k]
            })
        }
        var id = Math.floor(Math.random() * 9999999999);
        while (true) {
            if (!!exp_obj[id]) {
                id = Math.floor(Math.random() * 9999999999);
            } else {
                break
            }
        }
        expenses[id] = {
            id: id,
            name: _this.find('[name="expense_name"]').val(),
            amount: _this.find('[name="amount"]').val()
        }
        localStorage.setItem('expenses', JSON.stringify(expenses));
        alert("Expense has been added successfully.");
        location.reload();
    })
    $('#edit-expense-form').submit(function(e) {
        e.preventDefault()
        var _this = $(this)
        var expenses = !!localStorage.getItem('expenses') ? $.parseJSON(localStorage.getItem('expenses')) : {}
        expenses[_this.find('[name="id"]').val()] = {
                id: _this.find('[name="id"]').val(),
                name: _this.find('[name="expense_name"]').val(),
                amount: _this.find('[name="amount"]').val()
            }
            // console.log(expenses)
        localStorage.setItem('expenses', JSON.stringify(expenses));
        alert("Expense has been updated successfully.");
        location.reload();
        end_loader()
    })
})