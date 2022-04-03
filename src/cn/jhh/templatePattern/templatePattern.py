class TemplateClass:
    def q1(self):
        print("q1 : %s" %self.answer1())
    def q2(self):
        print("q2 : %s" %self.answer2())
    def answer1(self):
        return ""
    def answer2(self):
        return ""

class ConcreteClass1(TemplateClass):
    def answer1(self):
        return "A"
    def answer2(self):
        return "A"

class ConcreteClass2(TemplateClass):
    def answer1(self):
        return "B"
    def answer2(self):
        return "D"
def main():
    template = TemplateClass()
    template = ConcreteClass1()
    template.q1()
    template.q2()
    template = ConcreteClass2()
    template.q1()
    template.q2()

if __name__ == "__main__":
    main()