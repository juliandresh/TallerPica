package Cliente;

import java.rmi.RemoteException;

import enterprise.mtx.services.reporter.ReportingWSProxy;

public class Cliente 
{
	public static void main(String[] args)
	{
		ReportingWSProxy proxy = new ReportingWSProxy();
		try {
			proxy.generate();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
