import sqlite3

# DB 연결
con = splite3.connect('sample')
cur = con.cursor()

user_id = input('아이디를 입력해주세요.>>')
user_name = input('이름 입력해주세요>>')
user_email = input('이메일을 입력해주세요.>>')
user_birth_year = input('태어난 년도를 입력하세요>>')

#sql
slq_insert  = 'insert into usertable values(\'{}\',\'{}\',\'{}\',{})'.format(user_id,user_name,user_email,user_birth_year
cur.execite(slq_insert)

com.commit()
con.close()
#오류~~~~~~~~~~~~~~~~~~