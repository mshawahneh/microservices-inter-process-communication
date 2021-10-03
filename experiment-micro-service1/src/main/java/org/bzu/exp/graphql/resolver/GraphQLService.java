package org.bzu.exp.graphql.resolver;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Service
public class GraphQLService implements GraphQLQueryResolver{

	public String hello() {
		
		return "Hello";
	}
}
