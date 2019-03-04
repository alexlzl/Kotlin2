package com.test

class TeamMember(val name: String)
typealias MaybeTeamMember = TeamMember?

// Constructing with the alias: 使用别名来构造对象
val member1 =  MaybeTeamMember("Miguel")

// The above code does *not* expand verbatim to this (which wouldn't compile):(以上代码不会是逐字扩展成如下无法编译的代码)
//val member = TeamMember?("Miguel")

// Instead, it expands to this:(而是扩展如下代码)
val member2 = TeamMember("Miguel")