class SomeSingleton
  @@instance = SomeSingleton.new
  
  def self.instance
    return @@instance
  end
  
  private_class_method :new
end

some_singleton = SomeSingleton.instance
another_singleton = SomeSingleton.instance
