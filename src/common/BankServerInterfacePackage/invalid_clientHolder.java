package common.BankServerInterfacePackage;

/**
* common/BankServerInterfacePackage/invalid_clientHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from bankserver.idl
* Thursday, November 2, 2017 1:04:54 PM EDT
*/

public final class invalid_clientHolder implements org.omg.CORBA.portable.Streamable
{
  public common.BankServerInterfacePackage.invalid_client value = null;

  public invalid_clientHolder ()
  {
  }

  public invalid_clientHolder (common.BankServerInterfacePackage.invalid_client initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = common.BankServerInterfacePackage.invalid_clientHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    common.BankServerInterfacePackage.invalid_clientHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return common.BankServerInterfacePackage.invalid_clientHelper.type ();
  }

}
