import smtplib
Server=smtplib.SMTP('smtp.gmail.com',587)
Server.starttls()
Server.login("Hrushikeshpollai777@gmail.com","9090444025")
subject="Sending Email Using Python"
body="this is a text mail for testing purpose !!!"
message="subject:{}\n\n{}".format(subject,body)
print(message)
listOfAddress=["rishipollai@gmail.com","nikhyheart@gmail.com"]
Server.sendmail("Hrushikeshpollai777@gmail.com",listOfAddress,message)
print("email send succesfully") #Just for confirmation
Server.quit()