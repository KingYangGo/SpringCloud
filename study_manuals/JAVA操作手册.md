#### JAVA操作手册

###### stream.map()

map函数的作用就是针对管道流中的每一个数据元素进行转换操作。

```java
List<String> alpha = Arrays.asList("Monkey", "Lion", "Giraffe", "Lemur");

//不使用Stream管道流
List<String> alphaUpper = new ArrayList<>();
for (String s : alpha) {
    alphaUpper.add(s.toUpperCase());
}
System.out.println(alphaUpper); //[MONKEY, LION, GIRAFFE, LEMUR]

// 使用Stream管道流
List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
//上面使用了方法引用，和下面的lambda表达式语法效果是一样的
//List<String> collect = alpha.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

System.out.println(collect); //[MONKEY, LION, GIRAFFE, LEMUR]

```

[(87条消息) stream之map的用法_stream().map_江西昊仔的博客-CSDN博客](https://blog.csdn.net/lyh1023812/article/details/121538987)

###### Stream filter()过滤有效数据

```java
Collection<Person> collection = new ArrayList();
collection.add(new Person("张三", "男"));
collection.add(new Person("李四", "女"));
collection.add(new Person("王五", "男"));
collection.add(new Person("赵六", "男"));
 
Stream<Person> personStream = collection.stream().filter(new Predicate<Person>() {
    @Override
    public boolean test(Person person) {
        return "男".equals(person.getGender());//只保留男性
    }
});
 
collection = personStream.collect(Collectors.toList());//将Stream转化为List
System.out.println(collection.toString());//查看结果
```

```java
Stream<Person> personStream = collection.stream().filter(
        person -> "男".equals(person.getGender())//只保留男性
);
```

[(87条消息) Stream filter()过滤有效数据_stream.filter_爆米花9958的博客-CSDN博客](https://blog.csdn.net/xuemengrui12/article/details/120361388)