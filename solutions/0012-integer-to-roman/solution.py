class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        roman = ""

        if num >= 1000:
            count = num // 1000
            roman += "M" * count
            num = num % 1000

        if num >= 900:
            roman += "CM"
            num -= 900

        if num >= 500:
            roman += "D"
            num -= 500

        if num >= 400:
            roman += "CD"
            num -= 400

        if num >= 100:
            count = num // 100
            roman += "C" * count
            num = num % 100

        if num >= 90:
            roman += "XC"
            num -= 90

        if num >= 50:
            roman += "L"
            num -= 50

        if num >= 40:
            roman += "XL"
            num -= 40

        if num >= 10:
            count = num // 10
            roman += "X" * count
            num = num % 10

        if num == 9:
            roman += "IX"
            num -= 9

        if num >= 5:
            roman += "V"
            num -= 5

        if num == 4:
            roman += "IV"
            num -= 4

        if num >= 1:
            roman += "I" * num

        return roman
        
