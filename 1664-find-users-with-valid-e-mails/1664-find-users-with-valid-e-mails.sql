select * from users
where regexp_like (mail,'^[a-zA-Z][A-Za-z0-9_.-]*@leetcode[.]com$');