package hibernatetests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Message;
import com.samples.utils.HibernateUtils;

public class FindObjectTest {

	public static void main(String[] args) {

		Session session = HibernateUtils.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			Message message = session.get(Message.class, 4);

			System.out.println(message);

			txn.commit();

		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}