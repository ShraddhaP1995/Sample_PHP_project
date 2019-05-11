<<<<<<< HEAD
pipeline {

  agent {
    node {
      label 'master'
    }
  }

  options {
    timestamps()
  }

  stages {
    stage('PHPUnit Test') {
      steps {
        echo 'Running PHPUnit...'
        sh '/bin/phpunit ${WORKSPACE}/src'
      }
    }
  
  }
}
=======
 def getTagversion (String oldtagVersion)
{
    oldtagVersion = oldtagVersion.substring(1)
    println oldtagVersion
    def versionParts = oldtagVersion.tokenize('.')
    println versionParts
    major = versionParts[0].toInteger()
    minor = versionParts[1].toInteger()
    timetag = versionParts[2].toString()
    this.month = timetag.substring(4,6).toInteger()
    
    
    Calendar now = Calendar.getInstance();
    currmonth = (now.get(Calendar.MONTH) +1)
    
    Date date = new Date()
    //println date.getTime()
    //println date.format( 'yyyy-MM-ddHH:mm:ss.S' )
    String newtimetag = date.format( 'yyyyMMdd-HHmm' ).toString()
    //println strtimetag
    //timetag= timetag.replaceAll(":","-")
    
    
    if (currmonth==month)
    {
        
        version =  major+ "." + minor + "." +newtimetag
    }
    else
    {
      if (month < 9)
      {
    
        minor = minor +1
        version = major+ "." + minor + "." +newtimetag
                
      }
      else 
      {
        major = this.major +1
        minor = 0
        version = major+ "." + minor + "." +newtimetag
      }
        println oldtagVersion
    def versionParts = oldtagVersion.tokenize('.')
    println versionParts
    major = versionParts[0].toInteger()
    minor = versionParts[1].toInteger()
    timetag = versionParts[2].toString()
    this.month = timetag.substring(4,6).toInteger()
    
    
    Calendar now = Calendar.getInstance();
    currmonth = (now.get(Calendar.MONTH) +1)
    
    Date date = new Date()
    //println date.getTime()
    //println date.format( 'yyyy-MM-ddHH:mm:ss.S' )
    String newtimetag = date.format( 'yyyyMMdd-HHmm' ).toString()
    //println strtimetag
    //timetag= timetag.replaceAll(":","-")
    
    
    if (currmonth==month)
    {
        
        version =  major+ "." + minor + "." +newtimetag
    }
    else
    {
      if (month < 9)
      {
    
        minor = minor +1
        version = major+ "." + minor + "." +newtimetag
                
      }
      else 
      {
        major = this.major +1
        minor = 0
        version = major+ "." + minor + "." +newtimetag
      }
    }
    return version
}

>>>>>>> 4a79db2432dfe15a5eab1f9bb14c03d854481bad
