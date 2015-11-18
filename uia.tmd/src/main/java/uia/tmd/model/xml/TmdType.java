//
// ���ɮ׬O�� JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 �Ҳ��� 
// �аѾ\ <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �@�����s�sĶ�ӷ����n, �惡�ɮשҰ�������קﳣ�N�|��. 
// ���ͮɶ�: 2015.11.17 �� 05:53:15 PM CST 
//


package uia.tmd.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TmdType complex type �� Java ���O.
 * 
 * <p>�U�C���n���q�|���w�����O���]�t���w�����e.
 * 
 * <pre>
 * &lt;complexType name="TmdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskSpace" type="{http://tmd.uia/model/xml}TaskSpaceType"/>
 *         &lt;element name="tableSpace" type="{http://tmd.uia/model/xml}TableSpaceType"/>
 *         &lt;element name="databaseSpace" type="{http://tmd.uia/model/xml}DatabaseSpaceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmdType", propOrder = {
    "taskSpace",
    "tableSpace",
    "databaseSpace"
})
public class TmdType {

    @XmlElement(required = true)
    protected TaskSpaceType taskSpace;
    @XmlElement(required = true)
    protected TableSpaceType tableSpace;
    @XmlElement(required = true)
    protected DatabaseSpaceType databaseSpace;

    /**
     * ���o taskSpace �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link TaskSpaceType }
     *     
     */
    public TaskSpaceType getTaskSpace() {
        return taskSpace;
    }

    /**
     * �]�w taskSpace �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSpaceType }
     *     
     */
    public void setTaskSpace(TaskSpaceType value) {
        this.taskSpace = value;
    }

    /**
     * ���o tableSpace �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link TableSpaceType }
     *     
     */
    public TableSpaceType getTableSpace() {
        return tableSpace;
    }

    /**
     * �]�w tableSpace �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link TableSpaceType }
     *     
     */
    public void setTableSpace(TableSpaceType value) {
        this.tableSpace = value;
    }

    /**
     * ���o databaseSpace �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseSpaceType }
     *     
     */
    public DatabaseSpaceType getDatabaseSpace() {
        return databaseSpace;
    }

    /**
     * �]�w databaseSpace �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseSpaceType }
     *     
     */
    public void setDatabaseSpace(DatabaseSpaceType value) {
        this.databaseSpace = value;
    }

}
