#!/usr/bin/env python3
"""
Collection of 15 random Python codes covering various topics and concepts
"""

import random
import string
import math
from datetime import datetime, timedelta
from collections import defaultdict, Counter
import json

def generate_random_string(length=10):
    """Generate a random string of given length."""
    return ''.join(random.choice(string.ascii_letters + string.digits) for _ in range(length))

def fibonacci_series(n):
    """Generate Fibonacci series up to n terms."""
    series = []
    a, b = 0, 1
    for _ in range(n):
        series.append(a)
        a, b = b, a + b
    return series

def celsius_to_fahrenheit(celsius):
    """Convert Celsius to Fahrenheit."""
    return (celsius * 9/5) + 32

def calculate_compound_interest(principal, rate, time, compounds_per_year=12):
    """Calculate compound interest."""
    return principal * (1 + rate/compounds_per_year) ** (compounds_per_year * time)

def is_prime(n):
    """Check if a number is prime."""
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def generate_password(length=12):
    """Generate a random password."""
    characters = string.ascii_letters + string.digits + '!@#$%^&*'
    return ''.join(random.choice(characters) for _ in range(length))

def convert_to_binary(n):
    """Convert decimal to binary."""
    return bin(n).replace('0b', '')

def calculate_tip(amount, percentage=15):
    """Calculate tip amount."""
    return amount * (percentage / 100)

def is_leap_year(year):
    """Check if a year is a leap year."""
    return (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)

def get_weekday_name(day_num):
    """Convert day number to weekday name."""
    days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
    return days[day_num % 7]

def filter_even_numbers(numbers):
    """Filter even numbers from a list."""
    return [num for num in numbers if num % 2 == 0]

def find_most_common_word(text):
    """Find the most common word in a text."""
    words = text.lower().split()
    return Counter(words).most_common(1)[0]

def calculate_age(birth_year):
    """Calculate age based on birth year."""
    current_year = datetime.now().year
    return current_year - birth_year

def celsius_to_kelvin(celsius):
    """Convert Celsius to Kelvin."""
    return celsius + 273.15

def main():
    print("=== Random Python Codes Collection ===\n")
    
    print("1. Random String Generator:")
    random_str = generate_random_string(8)
    print(f"Generated string: {random_str}\n")
    
    print("2. Fibonacci Series:")
    fib = fibonacci_series(10)
    print(f"Fibonacci series: {fib}\n")
    
    print("3. Temperature Conversion:")
    celsius = 25
    fahrenheit = celsius_to_fahrenheit(celsius)
    print(f"{celsius}°C = {fahrenheit}°F\n")
    
    print("4. Compound Interest Calculation:")
    amount = calculate_compound_interest(1000, 0.05, 5)
    print(f"Compound interest: ${amount:.2f}\n")
    
    print("5. Prime Number Check:")
    prime_test = 17
    print(f"Is {prime_test} prime? {is_prime(prime_test)}\n")
    
    print("6. Password Generator:")
    password = generate_password()
    print(f"Generated password: {password}\n")
    
    print("7. Decimal to Binary Conversion:")
    decimal = 42
    binary = convert_to_binary(decimal)
    print(f"{decimal} in binary: {binary}\n")
    
    print("8. Tip Calculator:")
    bill = 50
    tip = calculate_tip(bill, 18)
    print(f"Tip on ${bill} bill (18%): ${tip:.2f}\n")
    
    print("9. Leap Year Check:")
    year = 2024
    print(f"Is {year} a leap year? {is_leap_year(year)}\n")
    
    print("10. Day of the Week:")
    day_num = 3
    weekday = get_weekday_name(day_num)
    print(f"Day {day_num} is {weekday}\n")
    
    print("11. Filter Even Numbers:")
    numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    evens = filter_even_numbers(numbers)
    print(f"Even numbers from {numbers}: {evens}\n")
    
    print("12. Most Common Word:")
    text = "the quick brown fox jumps over the lazy dog the quick fox"
    most_common = find_most_common_word(text)
    print(f"Most common word: '{most_common[0]}' (count: {most_common[1]})\n")
    
    print("13. Age Calculator:")
    birth_year = 1990
    age = calculate_age(birth_year)
    print(f"Age for birth year {birth_year}: {age} years\n")
    
    print("14. Temperature Unit Conversion:")
    celsius_temp = 100
    kelvin_temp = celsius_to_kelvin(celsius_temp)
    print(f"{celsius_temp}°C = {kelvin_temp} K\n")
    
    print("15. JSON Serialization:")
    data = {"name": "Alice", "age": 30, "city": "New York"}
    json_str = json.dumps(data, indent=2)
    print("JSON data:")
    print(json_str)

if __name__ == "__main__":
    main()