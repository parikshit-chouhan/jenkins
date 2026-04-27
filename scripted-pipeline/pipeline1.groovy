pipeline{

agent any

environment{

}

stages{
    stage("stage1"){
        steps{
            sh ' echo "this is the first stage" '
        }
    }
}

}