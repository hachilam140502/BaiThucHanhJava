n = int(input("nhập vào số lượng sinh viên:"))
sv=[]
def nhap():
    s = input("nhập vào số lượng sinh viên :")
    sv.append(s)
    def xuat(s):
        print("họ tên sinh viên:",s)
        for i in range(0,n):
            nhap()
            for i in sv:
                xuat(i)

    