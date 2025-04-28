def buildapp(){
    echo "building the application"
}

def testapp(){
    echo "testing the application"
}

def deployapp(){
    echo 'build deploy'
    echo "Version of ${params.VERSION}"
}

return this