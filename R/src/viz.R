# 라이브러리 설치
# install.packages("패키지명")
# load 라이브러리
# 파이썬 라이브러리 숫자가 20만개 넘음
# R, 2만개 미만
library(ggplot2)

data("mpg")
str(mpg)

#산점도
ggplot(mpg, aes(x = displ, y = cty)) +
  geom_point()

??ggplot

p <- ggplot(mpg, aes(displ, cty))
p + geom_point()
p + geom_point(aes(colour = factory(cyl)))

#라이브러리 설치
install.packages("ggstatsplot")
