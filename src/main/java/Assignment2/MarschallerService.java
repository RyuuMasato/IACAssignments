package Assignment2;

import javax.xml.bind.*;
import java.io.File;

public class MarschallerService {
    private File file;
    private JAXBContext jaxbContext;
    private Marshaller marschaller;
    private Unmarshaller unMarschaller;
    private Object object;

    public MarschallerService() {}

    private Object getObject() { return this.object; }

    private void setObject(Object object) { this.object = object; }

    private File getFile() { return this.file; }

    private void setFile(String file) {
        this.file = new File(file + ".xml");
    }

    private JAXBContext getJaxbContext() { return this.jaxbContext; }

    private void setJaxbContext() {
        try {
            this.jaxbContext = JAXBContext.newInstance(this.getObject().getClass());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Marshaller getMarchaller() { return this.marschaller; }

    private void setMarschaller() {
        try {
            this.marschaller = this.getJaxbContext().createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Unmarshaller getUnMarschaller() { return this.unMarschaller; }

    private void setUnMarschaller() {
        try {
            this.unMarschaller = this.getJaxbContext().createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void marschalObject(String file, Object object) {
        this.setFile(file);
        this.setObject(object);
        this.setJaxbContext();
        this.setMarschaller();
        try {
            this.marschaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            this.marschaller.marshal(this.getObject(), this.getFile());
            System.out.println(this.getObject());
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Object unMarchalObject(String file, Object object) {
        this.setFile(file);
        this.setObject(object);
        this.setJaxbContext();
        this.setUnMarschaller();
        try {
            Object objectIn = this.getUnMarschaller().unmarshal(this.getFile());
            System.out.println(objectIn);
            return objectIn;
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
}
