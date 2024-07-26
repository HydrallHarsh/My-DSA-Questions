def char_to_binary(char):
    if char.isupper():
        binary = bin(ord(char) - ord('A'))[2:].zfill(8)  # Convert to 8-bit
        return binary
    elif char.islower():
        binary = bin(ord(char) - ord('a'))[2:].zfill(8)  # Convert to 8-bit
        return binary
    else:
        raise ValueError("Invalid character: " + char)

def binary_to_char(binary):
    decimal = int(binary, 2) % 26
    return chr(decimal + ord('A'))

def apply_xor_operation(string, key):
    if len(string) != 7:
        raise ValueError("String must be exactly 7 characters long.")
        
    # Repeat the key to match the length of the input string
    repeated_key = (key * (7 // len(key))) + key[:7 % len(key)]

    binary_string = ''.join(char_to_binary(char) for char in string)
    binary_key = ''.join(char_to_binary(char) for char in repeated_key)

    result = ''
    original_result = ''  # Store the original XOR result before modulo operation
    for bit_str, bit_key in zip(binary_string, binary_key):
        xor_result = '1' if bit_str != bit_key else '0'
        result += xor_result
        original_result += '1' if bit_str != bit_key else '0'

    # Convert binary result back to characters
    result_chars = [result[i:i+8] for i in range(0, len(result), 8)]
    result_text = ''.join(binary_to_char(char) for char in result_chars)

    return result_text, original_result

# Function to decrypt the encrypted result
def decrypt_result(encrypted_result, key, original_xor):
    # Repeat the key to match the length of the input string
    repeated_key = (key * (7 // len(key))) + key[:7 % len(key)]

    binary_encrypted = original_xor
    binary_key = ''.join(char_to_binary(char) for char in repeated_key)

    decrypted = ''
    for bit_encrypted, bit_key, bit_original in zip(binary_encrypted, binary_key, original_xor):
        if bit_original == '1':  # Use the original XOR result
            decrypted_bit = '1' if bit_encrypted != bit_key else '0'
        else:
            decrypted_bit = '1' if bit_encrypted != bit_key else '0'  # Apply modulo 26 for decryption
        decrypted += decrypted_bit

    # Convert binary result back to characters
    decrypted_chars = [decrypted[i:i+8] for i in range(0, len(decrypted), 8)]
    decrypted_text = ''.join(binary_to_char(char) for char in decrypted_chars)
    return decrypted_text

# Taking user inputs
string = input("Enter the string: ").upper()  # Convert to uppercase
if len(string) != 7:
    print("String must be exactly 7 characters long.")
else:
    key = input("Enter the key: ").upper()  # Convert to uppercase

    # Encrypt the string
    encrypted_result, original_xor = apply_xor_operation(string, key)
    print("Encrypted Result:", encrypted_result)

    # Decrypt the encrypted result
    decrypted_result = decrypt_result(encrypted_result, key, original_xor)
    print("Decrypted Result:", decrypted_result)
