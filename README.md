# File Index Search

A lightweight Java-based search engine for indexing and searching text files in a folder.  
This project allows users to provide a folder path containing `.txt` documents and performs full-text search efficiently using tokenized content.

---

## Table of Contents

- [Overview](#overview)  
- [Features](#features)  
- [Getting Started](#getting-started)  
- [Usage](#usage)  
- [Project Structure](#project-structure)  
- [Classes](#classes)  
- [Future Enhancements](#future-enhancements)  
- [Author](#author)  

---

## Overview

The **File Index Search** project is designed to demonstrate fundamental concepts of text processing, data structures, and search algorithms in Java. It reads `.txt` files from a folder, tokenizes the content, and organizes the data for efficient search queries. This project is ideal for learning:

- File I/O in Java  
- Tokenization and text parsing  
- Object-oriented design principles  
- Basics of search indexing  

---

## Features

- Reads all `.txt` files from a user-specified folder  
- Automatically tokenizes each document into words  
- Stores document metadata (file name, path) for easy reference  
- Provides access to raw text and tokenized words for indexing/searching  
- Ready to be extended with search algorithms (e.g., inverted index, trie)  

---

## Getting Started

### Prerequisites

- Java 11 or later  
- Maven or Gradle (optional, for building if using dependencies)  
- Git (for cloning the repository)  

### Clone the Repository

```bash
git clone https://github.com/PrithuDutta/FileIndexSearch.git
cd FileIndexSearch
