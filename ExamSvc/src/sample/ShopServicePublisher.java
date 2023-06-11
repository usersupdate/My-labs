package sample;

import javax.xml.ws.Endpoint;

public class ShopServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/ShopSvcWeb/ShowCatalog", new ShopService());
	}
}
