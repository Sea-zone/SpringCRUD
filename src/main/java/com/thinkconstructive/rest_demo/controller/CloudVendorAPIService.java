package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    // Simulating a single cloud vendor object (could be extended to use a list or database)
    CloudVendor cloudVendor;

    // Get method
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        // Check if the cloudVendor exists and matches the requested vendorId
        if (cloudVendor != null && cloudVendor.getVendorId().equals(vendorId)) {
            return cloudVendor;
        }
        // Return null or handle not found logic here (could return a custom error response)
        return null;
    }

    // Post method
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully";
    }

    // Put method
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated successfully";
    }

    // Delete method
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId) {
        // Check if the cloudVendor exists and matches the requested vendorId
        if (cloudVendor != null && cloudVendor.getVendorId().equals(vendorId)) {
            cloudVendor = null;
            return "Cloud vendor deleted successfully";
        }
        // Handle not found case
        return "Cloud vendor not found";
    }
}
