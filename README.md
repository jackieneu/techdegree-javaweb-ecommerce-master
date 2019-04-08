# techdegree-javaweb-ecommerce-master | Techdegree Project 8

Ecommerce with Spring and Hibernate

Code files: /src/main

## Before Starting Project: 
- Download the project files. We've supplied a ZIP archive for you to download and extract, then import into your IDE of choice.
- Configure the path to product image files
  - Add a file named eCommerce.properties anywhere on your local machine. In this file, include a property named imagePath whose value is the absolute path to the project directory src/main/resources/static/images/. For example, your properties file may look as follows:
`imagePath = /Users/kayla/Code/td/techdegree-javaweb-ecommerce/src/main/resources/static/images/`

  - Note that you could move this images directory anywhere you like, as long as the imagePath property is updated accordingly.

  - Update the bootRun task in build.gradle so that the properties.home variable is set to the directory that contains your eCommerce.properties file. Unless you’ve placed the properties file somewhere in the project directory, this value must be an absolute path. For example, the bootRun task may look as follows:
    ```
    bootRun {
        jvmArgs = [“-Dproperties.home=/Users/kayla/Code/td/properties”]
    }
    ```
  - This would require your properties file to be located at `/Users/kayla/Code/td/properties/eCommerce.properties`

- Run and preview the application:
  - Page through products in the storefront
  - Click on product picture to reveal product detail page
  - Add products from the storefront and from product detail pages
  - View the cart, updating and removing products
  - Go through the checkout process, providing valid and invalid data
- Explore the source code
  - Open the controller classes, and find the methods that process individual requests
  - View the entity models in the domain package
  - Explore the service and repository packages
  - Look through the config package to see how the application is configured
  - Locate the application properties files and notice configuration values
  - Find the initial data that is loaded upon application startup
  - Locate and run all tests

## Minimum Viable Product:

- Bug fix: Add form validation to the coupon code field in the first step of the checkout process. A coupon code will be considered valid if it contains between 5 and 10 characters. A unit test should also be added to verify that the added validation is working.
- Bug fix: Ensure that enough products are in stock before adding to the shopping cart. Whether adding products to the cart from product detail pages or updating an product’s quantity from the cart view, more products than are in stock can be added to the cart. Fix this issue and add a unit test to cover this scenario.
- Bug fix: Update the order confirmation view template to mask all but the last 4 digits of the credit card number.
- Bug fix: Update the order confirmation email template to remove the billing address and all payment info.
  - Note that the email feature is not fully implemented since it would require an SMTP server, so this is implemented instead as a file download on the confirmation page. The HTML of this file would be sent as the content of the confirmation email in a fully implemented version.

- Enhancement: Add the cart subtotal to the page header, as part of the “View Cart” link. The subtotal should display only if the cart is not empty, and the number should be formatted with a dollar sign, as well as a comma for the thousands separator. Add a unit test to verify that the rendered view contains the subtotal.
- Enhancement: Add flash messaging to the application for adding, updating, and removing products from the cart, and for emptying the cart. Don’t forget the case for when a user tries to request a product quantity that exceeds its amount in stock. Include unit tests to verify that flash messages work correctly.
- Enhancement: Detect when a product’s detail view is requested, but the id requested isn’t found in the database. The rendered view should display a message saying that the product wasn’t found.

## Extra Credit:

- Combine the common elements of Thymeleaf templates into a single template as fragments, and include those fragments in the individual templates, so as to eliminate the duplication of markup.
- Throw exceptions in the service layer for the case when an product’s requested quantity exceeds the quantity in stock, instead of checking the quantity in the controller.
- Throw an exception in the service layer for the case when a certain product entity is requested - ProductService.findById(Long) - but is not found. Explicitly catch this exception in the controller layer, or use an @ExceptionHandler as stated in the next extra credit opportunity.
- Research @ExceptionHandler controller methods in Spring, and add one for when a product’s detail view is requested for an unknown product id. This should produce a 404 response code and render a view that displays a friendly page saying that the product wasn’t found.
