--
-- @lc app=leetcode.cn id=175 lang=mysql
--
-- [175] 组合两个表
--

-- @lc code=start
# Select Person.FirstName, Person.LastName, Address.City, Address.State
From Person
Left Join Address
On Person.PersonId = Address.PersonId;Write your MySQL query statement below
-- @lc code=end

