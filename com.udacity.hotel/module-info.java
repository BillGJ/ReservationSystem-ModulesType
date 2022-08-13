module com.udacity.hotel {
    exports com.udacity.hotel.search;
    exports com.udacity.hotel.model;
    opens com.udacity.hotel.model to com.udacity.packagesearch; 
    // Add your code here

}