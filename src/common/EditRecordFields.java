package common;


/**
* common/EditRecordFields.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from bankserver.idl
* Thursday, November 2, 2017 1:04:54 PM EDT
*/

public class EditRecordFields implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static common.EditRecordFields[] __array = new common.EditRecordFields [__size];

  public static final int _address = 0;
  public static final common.EditRecordFields address = new common.EditRecordFields(_address);
  public static final int _phone = 1;
  public static final common.EditRecordFields phone = new common.EditRecordFields(_phone);
  public static final int _branch = 2;
  public static final common.EditRecordFields branch = new common.EditRecordFields(_branch);

  public int value ()
  {
    return __value;
  }

  public static common.EditRecordFields from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected EditRecordFields (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class EditRecordFields
