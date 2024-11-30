#!/bin/bash

# Clear Maven repository
echo "Clearing Maven repository..."
rm -rf ~/.m2/repository

# Clear project target directory
echo "Cleaning project target directory..."
mvn clean

echo "Done!"
