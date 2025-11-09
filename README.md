# 🚗 CarPucho — AI-Powered Car Enquiry Assistant

CarPucho is an AI-driven car enquiry application built using **Spring Boot** and **Spring AI**.  
It allows users to ask questions about cars based on their **budget**, **segment**, and **use case**, while also tracking **token usage** through a custom advisor.

---

## 🧠 Overview

This project integrates **Spring AI** with **Ollama (or any LLM provider)** to simulate a car expert that helps users make better purchase decisions.

You can ask questions like:

> "Which SUV should I buy under 15 lakhs?"  
> "Recommend a sedan around 10 lakhs with good mileage."  
> "What is the best electric car for city driving under 20 lakhs?"

The system processes your query, builds a context-aware prompt, and returns expert-like suggestions.

---

## ⚙️ Tech Stack

- **Java 17+**
- **Spring Boot 3.5+**
- **Spring AI**
- **Ollama / OpenAI-compatible backend**
- **Maven**
- **Custom Spring AI Advisors** for logging and token tracking

---

## 🧩 Key Features

- 💬 **Natural language car queries** based on segment & budget  
- 🧠 **AI-powered recommendations** via LLM integration  
- 🔍 **Dynamic prompt building** with `PromptTemplate`  
- 📊 **Custom Advisor** for tracking token usage  
- 🧾 **SimpleLoggerAdvisor** for logging requests and responses  
- ⚡ **Extensible architecture** for integrating APIs or RAG later  

---



