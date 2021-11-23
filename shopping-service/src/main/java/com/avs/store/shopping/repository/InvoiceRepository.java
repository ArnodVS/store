package com.avs.store.shopping.repository;

import com.avs.store.shopping.repository.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

    List<Invoice> findByCustomerId(Long customerId );

    Invoice findByNumberInvoice(String numberInvoice);

}
