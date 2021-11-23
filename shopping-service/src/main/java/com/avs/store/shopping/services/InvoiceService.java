package com.avs.store.shopping.services;

import com.avs.store.shopping.repository.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    List<Invoice> findInvoiceAll();

    Invoice createInvoice(Invoice invoice);

    Invoice updateInvoice(Invoice invoice);

    Invoice deleteInvoice(Invoice invoice);

    Invoice getInvoice(Long id);

}
