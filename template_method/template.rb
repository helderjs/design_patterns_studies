class Template
  def print
    print_header
    print_body
  end
end

class HTMLTemplate < Template
  def print_header
    puts "<html>"
  end
  
  def print_body
    puts "Data"
  end
end

class TextTemplate < Template
  def print_header
    puts "***"
  end
  
  def print_body
    puts "Data"
  end
end

html_template = HTMLTemplate.new
html_template.print

text_template = TextTemplate.new
text_template.print