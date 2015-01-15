

decorate :: (Num a) => (a -> a) -> (a -> a)
decorate f = (f' f) where 
  f' :: (Num a) => (a -> a) -> a -> a
  f' f x = 1 + (f x)


square :: (Num a) => a -> a
square x = x*x
-- square 2 => 4

decorated_square = decorate square
--- decorated_square 2 => 5

