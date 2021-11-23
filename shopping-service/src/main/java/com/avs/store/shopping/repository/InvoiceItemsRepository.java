package com.avs.store.shopping.repository;

import com.avs.store.shopping.repository.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem, Long> { }
