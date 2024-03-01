package ch.so.agi.datahub.cayenne.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;

import ch.so.agi.datahub.cayenne.CoreApikey;
import ch.so.agi.datahub.cayenne.CoreOperat;

/**
 * Class _CoreOrganisation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CoreOrganisation extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String T_ID_PK_COLUMN = "t_id";

    public static final StringProperty<String> ANAME = PropertyFactory.createString("aname", String.class);
    public static final StringProperty<String> AROLE = PropertyFactory.createString("arole", String.class);
    public static final StringProperty<String> AUID = PropertyFactory.createString("auid", String.class);
    public static final ListProperty<CoreApikey> CORE_APIKEYS = PropertyFactory.createList("coreApikeys", CoreApikey.class);
    public static final ListProperty<CoreOperat> CORE_OPERATS = PropertyFactory.createList("coreOperats", CoreOperat.class);

    protected String aname;
    protected String arole;
    protected String auid;

    protected Object coreApikeys;
    protected Object coreOperats;

    public void setAname(String aname) {
        beforePropertyWrite("aname", this.aname, aname);
        this.aname = aname;
    }

    public String getAname() {
        beforePropertyRead("aname");
        return this.aname;
    }

    public void setArole(String arole) {
        beforePropertyWrite("arole", this.arole, arole);
        this.arole = arole;
    }

    public String getArole() {
        beforePropertyRead("arole");
        return this.arole;
    }

    public void setAuid(String auid) {
        beforePropertyWrite("auid", this.auid, auid);
        this.auid = auid;
    }

    public String getAuid() {
        beforePropertyRead("auid");
        return this.auid;
    }

    public void addToCoreApikeys(CoreApikey obj) {
        addToManyTarget("coreApikeys", obj, true);
    }

    public void removeFromCoreApikeys(CoreApikey obj) {
        removeToManyTarget("coreApikeys", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CoreApikey> getCoreApikeys() {
        return (List<CoreApikey>)readProperty("coreApikeys");
    }

    public void addToCoreOperats(CoreOperat obj) {
        addToManyTarget("coreOperats", obj, true);
    }

    public void removeFromCoreOperats(CoreOperat obj) {
        removeToManyTarget("coreOperats", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CoreOperat> getCoreOperats() {
        return (List<CoreOperat>)readProperty("coreOperats");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "aname":
                return this.aname;
            case "arole":
                return this.arole;
            case "auid":
                return this.auid;
            case "coreApikeys":
                return this.coreApikeys;
            case "coreOperats":
                return this.coreOperats;
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
            case "aname":
                this.aname = (String)val;
                break;
            case "arole":
                this.arole = (String)val;
                break;
            case "auid":
                this.auid = (String)val;
                break;
            case "coreApikeys":
                this.coreApikeys = val;
                break;
            case "coreOperats":
                this.coreOperats = val;
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
        out.writeObject(this.aname);
        out.writeObject(this.arole);
        out.writeObject(this.auid);
        out.writeObject(this.coreApikeys);
        out.writeObject(this.coreOperats);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.aname = (String)in.readObject();
        this.arole = (String)in.readObject();
        this.auid = (String)in.readObject();
        this.coreApikeys = in.readObject();
        this.coreOperats = in.readObject();
    }

}
