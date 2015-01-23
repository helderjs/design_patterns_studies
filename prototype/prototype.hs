
data Car c m y = Car {
  company :: c,
  model :: m,
  year :: y
} deriving (Show)

makeCar :: (Show a) => String -> String -> a -> Car String String a
makeCar c m y = Car c m y

describeCar :: (Show a) => Car String String a -> String
describeCar (Car {company = c, model = m, year = y}) = "This " ++ m ++ " was made by " ++ c ++ " in " ++ show y
