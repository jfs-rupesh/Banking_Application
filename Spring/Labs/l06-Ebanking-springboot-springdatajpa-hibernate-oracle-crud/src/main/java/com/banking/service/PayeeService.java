package com.banking.service;

import java.util.List;

import com.banking.entity.Payee;

public interface PayeeService {
List<Payee> getProducts();
Payee addProduct(Payee product);
Payee updateProduct(Payee product);
void deleteProduct(int productId);
}
