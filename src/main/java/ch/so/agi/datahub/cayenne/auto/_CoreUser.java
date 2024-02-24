package ch.so.agi.datahub.cayenne.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.BaseProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;

import ch.so.agi.datahub.cayenne.CoreOrganisationUser;
import ch.so.agi.datahub.cayenne.DeliveriesDelivery;

/**
 * Class _CoreUser was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CoreUser extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String T_ID_PK_COLUMN = "t_id";

    public static final StringProperty<String> AROLE = PropertyFactory.createString("arole", String.class);
    public static final BaseProperty<Boolean> ISACTIVE = PropertyFactory.createBase("isactive", Boolean.class);
    public static final StringProperty<String> USERID = PropertyFactory.createString("userid", String.class);
    public static final ListProperty<CoreOrganisationUser> CORE_ORGANISATION_USERS = PropertyFactory.createList("coreOrganisationUsers", CoreOrganisationUser.class);
    public static final ListProperty<DeliveriesDelivery> DELIVERIES_DELIVERIES = PropertyFactory.createList("deliveriesDeliveries", DeliveriesDelivery.class);

    protected String arole;
    protected Boolean isactive;
    protected String userid;

    protected Object coreOrganisationUsers;
    protected Object deliveriesDeliveries;

    public void setArole(String arole) {
        beforePropertyWrite("arole", this.arole, arole);
        this.arole = arole;
    }

    public String getArole() {
        beforePropertyRead("arole");
        return this.arole;
    }

    public void setIsactive(Boolean isactive) {
        beforePropertyWrite("isactive", this.isactive, isactive);
        this.isactive = isactive;
    }

    public Boolean getIsactive() {
        beforePropertyRead("isactive");
        return this.isactive;
    }

    public void setUserid(String userid) {
        beforePropertyWrite("userid", this.userid, userid);
        this.userid = userid;
    }

    public String getUserid() {
        beforePropertyRead("userid");
        return this.userid;
    }

    public void addToCoreOrganisationUsers(CoreOrganisationUser obj) {
        addToManyTarget("coreOrganisationUsers", obj, true);
    }

    public void removeFromCoreOrganisationUsers(CoreOrganisationUser obj) {
        removeToManyTarget("coreOrganisationUsers", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CoreOrganisationUser> getCoreOrganisationUsers() {
        return (List<CoreOrganisationUser>)readProperty("coreOrganisationUsers");
    }

    public void addToDeliveriesDeliveries(DeliveriesDelivery obj) {
        addToManyTarget("deliveriesDeliveries", obj, true);
    }

    public void removeFromDeliveriesDeliveries(DeliveriesDelivery obj) {
        removeToManyTarget("deliveriesDeliveries", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<DeliveriesDelivery> getDeliveriesDeliveries() {
        return (List<DeliveriesDelivery>)readProperty("deliveriesDeliveries");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "arole":
                return this.arole;
            case "isactive":
                return this.isactive;
            case "userid":
                return this.userid;
            case "coreOrganisationUsers":
                return this.coreOrganisationUsers;
            case "deliveriesDeliveries":
                return this.deliveriesDeliveries;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "arole":
                this.arole = (String)val;
                break;
            case "isactive":
                this.isactive = (Boolean)val;
                break;
            case "userid":
                this.userid = (String)val;
                break;
            case "coreOrganisationUsers":
                this.coreOrganisationUsers = val;
                break;
            case "deliveriesDeliveries":
                this.deliveriesDeliveries = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.arole);
        out.writeObject(this.isactive);
        out.writeObject(this.userid);
        out.writeObject(this.coreOrganisationUsers);
        out.writeObject(this.deliveriesDeliveries);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.arole = (String)in.readObject();
        this.isactive = (Boolean)in.readObject();
        this.userid = (String)in.readObject();
        this.coreOrganisationUsers = in.readObject();
        this.deliveriesDeliveries = in.readObject();
    }

}