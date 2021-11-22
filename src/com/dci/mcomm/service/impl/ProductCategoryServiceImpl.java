package com.dci.mcomm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dci.mcomm.entity.ProductCategory;
import com.dci.mcomm.service.ProductCategoryService;

public class ProductCategoryServiceImpl implements ProductCategoryService {
	Scanner userInputCategory = new Scanner(System.in);


	// collect details of a new ProductCategory and add to the list
	@Override
	public ProductCategory add() {
		//if user choosing number 1. "Add new"
		//add the input from the user to the list of Categories
		System.out.println("What is the name of the category you want to add?");
		String categoryName = userInputCategory.nextLine();

		return null;
	}

	// add a new ProductCategory to the list
	@Override
	public String add(ProductCategory category) {
		//I want to add the new category from previous method to ProductCategory
		String category = userInputCategory.nextLine();
		ArrayList <String> userAdded = new ArrayList<String>();
		userAdded.add(category);

		return category;

		}


	// collect new details of an existing ProductCategory and update the list
	@Override
	public ProductCategory update(int id) {
		//ask user about ID of new Category
		System.out.println("What is the ID of the category?");
		String userIDInput = userInputCategory.nextLine();
		int newCategoryID = Integer.parseInt(userIDInput);

		return null;
	}

	// update an existing ProductCategory in the list
	@Override
	public ProductCategory update(ProductCategory category) {
		//it supposed to add ID to current list of Categories
		return null;
	}

	// remove a matching ProductCategory from the list
	@Override
	public ProductCategory remove(int id) {
		//it supposed to remove the item from method below.
		return null;
	}

	// identify a matching ProductCategory in the list
	@Override
	public ProductCategory find(int id) {
		//it supposes to find all the matches for user input
		return null;
	}

	// access the current list of ProductCategories
	@Override
	public List<ProductCategory> list() {
		return new ArrayList<ProductCategory>();
	}

}
