#!/bin/bash

# Check if the user provided a folder name
if [ -z "$1" ]; then
    echo "Please provide a folder name."
    exit 1
fi

# Create the folder
mkdir -p "$1"

# Navigate into the folder
cd "$1" && touch description.md solution."$2"

echo "Folder '$1' created with description.md, solution."$2" files."