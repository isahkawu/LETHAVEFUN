def Temperature(Celsius):

    Fahrenheit = (Celsius * 1.8) + 32

    if Fahrenheit > 25:
        print("Heat Alert")

    else:
        print("Cold Advisory")

    return Fahrenheit


def Convert(Fahrenheit):

    Celsius = (Fahrenheit - 32) / 1.8

    if Celsius < 0:
        print("Cold Advisory")

    else:
        print("Temperature is normal")

    return Celsius


print(Temperature(30))
print(Convert(30))
