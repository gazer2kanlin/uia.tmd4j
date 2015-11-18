//
// ���ɮ׬O�� JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 �Ҳ��� 
// �аѾ\ <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �@�����s�sĶ�ӷ����n, �惡�ɮשҰ�������קﳣ�N�|��. 
// ���ͮɶ�: 2015.11.17 �� 05:53:15 PM CST 
//


package uia.tmd.model.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PlanType complex type �� Java ���O.
 * 
 * <p>�U�C���n���q�|���w�����O���]�t���w�����e.
 * 
 * <pre>
 * &lt;complexType name="PlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rule">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="criteria" type="{http://tmd.uia/model/xml}CriteriaType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceSelect" type="{http://tmd.uia/model/xml}SourceSelectType"/>
 *         &lt;element name="targetUpdate" type="{http://tmd.uia/model/xml}TargetUpdateType"/>
 *         &lt;element name="nexts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan" type="{http://tmd.uia/model/xml}PlanType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanType", propOrder = {
    "rule",
    "description",
    "sourceSelect",
    "targetUpdate",
    "nexts"
})
public class PlanType {

    @XmlElement(required = true)
    protected PlanType.Rule rule;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected SourceSelectType sourceSelect;
    @XmlElement(required = true)
    protected TargetUpdateType targetUpdate;
    @XmlElement(required = true)
    protected PlanType.Nexts nexts;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * ���o rule �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link PlanType.Rule }
     *     
     */
    public PlanType.Rule getRule() {
        return rule;
    }

    /**
     * �]�w rule �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanType.Rule }
     *     
     */
    public void setRule(PlanType.Rule value) {
        this.rule = value;
    }

    /**
     * ���o description �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * �]�w description �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ���o sourceSelect �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link SourceSelectType }
     *     
     */
    public SourceSelectType getSourceSelect() {
        return sourceSelect;
    }

    /**
     * �]�w sourceSelect �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceSelectType }
     *     
     */
    public void setSourceSelect(SourceSelectType value) {
        this.sourceSelect = value;
    }

    /**
     * ���o targetUpdate �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link TargetUpdateType }
     *     
     */
    public TargetUpdateType getTargetUpdate() {
        return targetUpdate;
    }

    /**
     * �]�w targetUpdate �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetUpdateType }
     *     
     */
    public void setTargetUpdate(TargetUpdateType value) {
        this.targetUpdate = value;
    }

    /**
     * ���o nexts �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link PlanType.Nexts }
     *     
     */
    public PlanType.Nexts getNexts() {
        return nexts;
    }

    /**
     * �]�w nexts �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanType.Nexts }
     *     
     */
    public void setNexts(PlanType.Nexts value) {
        this.nexts = value;
    }

    /**
     * ���o name �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * �]�w name �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>anonymous complex type �� Java ���O.
     * 
     * <p>�U�C���n���q�|���w�����O���]�t���w�����e.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="plan" type="{http://tmd.uia/model/xml}PlanType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "plan"
    })
    public static class Nexts {

        @XmlElement(required = true)
        protected List<PlanType> plan;

        /**
         * Gets the value of the plan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlanType }
         * 
         * 
         */
        public List<PlanType> getPlan() {
            if (plan == null) {
                plan = new ArrayList<PlanType>();
            }
            return this.plan;
        }

    }


    /**
     * <p>anonymous complex type �� Java ���O.
     * 
     * <p>�U�C���n���q�|���w�����O���]�t���w�����e.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="criteria" type="{http://tmd.uia/model/xml}CriteriaType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "criteria"
    })
    public static class Rule {

        @XmlElement(required = true)
        protected List<CriteriaType> criteria;

        /**
         * Gets the value of the criteria property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the criteria property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCriteria().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CriteriaType }
         * 
         * 
         */
        public List<CriteriaType> getCriteria() {
            if (criteria == null) {
                criteria = new ArrayList<CriteriaType>();
            }
            return this.criteria;
        }

    }

}
