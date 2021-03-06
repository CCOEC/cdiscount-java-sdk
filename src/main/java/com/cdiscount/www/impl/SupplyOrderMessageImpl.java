/*
 * XML Type:  SupplyOrderMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SupplyOrderMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SupplyOrderMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.SupplyOrderMessage
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENTPAGENUMBER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CurrentPageNumber");
    private static final javax.xml.namespace.QName NUMBEROFPAGES$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfPages");
    private static final javax.xml.namespace.QName SUPPLYORDERLINELIST$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderLineList");
    
    
    /**
     * Gets the "CurrentPageNumber" element
     */
    public int getCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentPageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentPageNumber" element
     */
    public boolean isSetCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTPAGENUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "CurrentPageNumber" element
     */
    public void setCurrentPageNumber(int currentPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTPAGENUMBER$0);
            }
            target.setIntValue(currentPageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentPageNumber" element
     */
    public void xsetCurrentPageNumber(org.apache.xmlbeans.XmlInt currentPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTPAGENUMBER$0);
            }
            target.set(currentPageNumber);
        }
    }
    
    /**
     * Unsets the "CurrentPageNumber" element
     */
    public void unsetCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTPAGENUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "NumberOfPages" element
     */
    public int getNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfPages" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfPages" element
     */
    public boolean isSetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFPAGES$2) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfPages" element
     */
    public void setNumberOfPages(int numberOfPages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPAGES$2);
            }
            target.setIntValue(numberOfPages);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfPages" element
     */
    public void xsetNumberOfPages(org.apache.xmlbeans.XmlInt numberOfPages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFPAGES$2);
            }
            target.set(numberOfPages);
        }
    }
    
    /**
     * Unsets the "NumberOfPages" element
     */
    public void unsetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFPAGES$2, 0);
        }
    }
    
    /**
     * Gets the "SupplyOrderLineList" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderLine getSupplyOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINELIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderLineList" element
     */
    public boolean isNilSupplyOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINELIST$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SupplyOrderLineList" element
     */
    public boolean isSetSupplyOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYORDERLINELIST$4) != 0;
        }
    }
    
    /**
     * Sets the "SupplyOrderLineList" element
     */
    public void setSupplyOrderLineList(com.cdiscount.www.ArrayOfSupplyOrderLine supplyOrderLineList)
    {
        generatedSetterHelperImpl(supplyOrderLineList, SUPPLYORDERLINELIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderLineList" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderLine addNewSupplyOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().add_element_user(SUPPLYORDERLINELIST$4);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderLineList" element
     */
    public void setNilSupplyOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINELIST$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().add_element_user(SUPPLYORDERLINELIST$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SupplyOrderLineList" element
     */
    public void unsetSupplyOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYORDERLINELIST$4, 0);
        }
    }
}
