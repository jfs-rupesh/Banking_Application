import { PayeeServiceService } from '../service/payee-service.service';
import { ProductService } from '../service/product.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit, AfterViewInit } from '@angular/core';
import { Payee } from '../model/payee.model';
import { Product } from '../model/Product.model'

@Component({
  selector: 'app-list-pay',
  templateUrl: './list-payee.component.html',
  styleUrls: ['./list-payee.component.css']
})
export class ListPayComponent implements OnInit {
  payees: Payee[] = [{}];
  products: Product[] = [{}];
 

  constructor(private http: HttpClient, private payeeService: PayeeServiceService) {
  
    console.log("ListPayComponent Constructor");
  }

  ngOnInit() {
   // this.productService.getProducts().subscribe((products: Product[]) => { this.products = products });
   
   this.payeeService.getPayees().subscribe((payees: Payee[]) => { this.payees = payees });
  console.log("payee list"+this.payees);
  }
  // loadBackendData() {
  //   console.log("ListPayComponent ngOnInit" + this.payees);
  //   this.http.get<Payee[]>('http://localhost:3000/payees')
  //     .subscribe((data: Payee[]) => {
  //       //console.log("data : " + JSON.stringify(data));
  //       this.payees = data;
  //       // console.log("this.payees : " + this.payees);
  //       //console.log("Inside");
  //       console.log("Inside : " + this.payees);
  //     });
  //   console.log("Outside : " + this.payees);

  // }

}
