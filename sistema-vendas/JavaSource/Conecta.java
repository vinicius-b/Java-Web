import org.hibernate.Session;

import com.kurtphpr.sistema.vendas.HibernateUtil;

public class Conecta {

	public static void main(String[] args) {
		Session sessao = null;
		
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("Conectou!!!\n");
		}finally{
			sessao.close();
			System.out.println("Fechou conexão! \n");
		}
	}
}
