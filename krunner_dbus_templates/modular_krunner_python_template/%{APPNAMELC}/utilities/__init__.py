from functools import wraps

def convert_to_tupel(original_function):
    @wraps(original_function)
    def wrapper_function(*args, **kwargs):
        return [match.to_tupel() for match in original_function(*args, **kwargs)]
    return wrapper_function
