#### JAVA操作手册

##### java新特性

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

##### Java日志查看

###### cat xxx.log | grep -n -C20 ‘keyword’ 

这个命令的意思是：
打开文件xxx.log(cat xxx.log)并在文件中搜索关键字keyword(grep ‘keyword’)并打印关键字所在的行的前后20行(-C20)并在打印的行前面标记行号(-n)

下面对这个命令中包含的参数延伸一下。
1.cat file // 将文件file打印输出
2.grep ‘keyword’ // 打印当前文件包含keyword的行 注意这个一个是对打开的文件，就比如上面和cat一起用才行
3.grep ‘keyword’ /directory/* // 同上，区别是可以单独用，不必和文件一起用，作用搜索directory目录中所有的文件
4.grep -r ‘keyword’ /directory // -r是指在directory目录下递归的遍历文件，如果目录中只有文件，那么效果上上面的一样，如果有目录，会深入到目录里去找关键字
5.grep -C10 ‘keyword’ //打印当前文件包含keyword的行以及前后10行 -C表示前后 -B表示前x行 -A表示后x行

场景2：
如果一点线索都没有，也没有报错信息，那就只能根据崩溃的大概时间来翻看日志，日志通畅是个很大的文本文件，翻看日志用鼠标滑轮太慢了，可以通过vim翻看。
1.vim xxx.log

###### 2.ctrl+f向下翻一个屏幕 ctrl+b向上翻一个屏幕

场景3：
场景2翻看要比鼠标快一些，看看有哪些报错的地方。当然如果有点线索，是最好的，或者线索比较宽泛，比如日志打印了一些信息，但是这些信息重复了好多次，还是很难筛选，那就可以通过vim的关键字匹配翻看，总之核心就是”翻看“，只不过不是在整个文档中翻看。
1.vim xxx.log

###### 2.输入‘：’进入底线令模式

3.输入/keywords 然后回车 vim会把所有的这个关键字高亮

###### 查看关键字下多少x行信息(cat指令)

cat xxx|grep -A 10“关键信息"

###### 直接进入日志用关键字定位（less）指令

less server.log 

进入之后输入"/xxx"