/*
 * An XML document type.
 * Localname: GetProductStockList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductStockListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductStockList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductStockListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductStockListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductStockListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTSTOCKLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductStockList");
    
    
    /**
     * Gets the "GetProductStockList" element
     */
    public com.cdiscount.www.GetProductStockListDocument.GetProductStockList getGetProductStockList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductStockListDocument.GetProductStockList target = null;
            target = (com.cdiscount.www.GetProductStockListDocument.GetProductStockList)get_store().find_element_user(GETPRODUCTSTOCKLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductStockList" element
     */
    public void setGetProductStockList(com.cdiscount.www.GetProductStockListDocument.GetProductStockList getProductStockList)
    {
        generatedSetterHelperImpl(getProductStockList, GETPRODUCTSTOCKLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductStockList" element
     */
    public com.cdiscount.www.GetProductStockListDocument.GetProductStockList addNewGetProductStockList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductStockListDocument.GetProductStockList target = null;
            target = (com.cdiscount.www.GetProductStockListDocument.GetProductStockList)get_store().add_element_user(GETPRODUCTSTOCKLIST$0);
            return target;
        }
    }
    /**
     * An XML GetProductStockList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductStockListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductStockListDocument.GetProductStockList
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductStockListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName REQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "request");
        
        
        /**
         * Gets the "headerMessage" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage getHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "headerMessage" element
         */
        public boolean isNilHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "headerMessage" element
         */
        public boolean isSetHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEADERMESSAGE$0) != 0;
            }
        }
        
        /**
         * Sets the "headerMessage" element
         */
        public void setHeaderMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage headerMessage)
        {
            generatedSetterHelperImpl(headerMessage, HEADERMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "headerMessage" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage addNewHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().add_element_user(HEADERMESSAGE$0);
                return target;
            }
        }
        
        /**
         * Nils the "headerMessage" element
         */
        public void setNilHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().add_element_user(HEADERMESSAGE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "headerMessage" element
         */
        public void unsetHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEADERMESSAGE$0, 0);
            }
        }
        
        /**
         * Gets the "request" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "request" element
         */
        public boolean isNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "request" element
         */
        public boolean isSetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "request" element
         */
        public void setRequest(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest request)
        {
            generatedSetterHelperImpl(request, REQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().add_element_user(REQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "request" element
         */
        public void setNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().add_element_user(REQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "request" element
         */
        public void unsetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$2, 0);
            }
        }
    }
}
