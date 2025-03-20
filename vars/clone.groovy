def call(String GIT_URL,String BRANCH_NAME){
  echo "Cloning Repository"
  git url: "${GIT_URL}", branch: "${BRANCH_NAME}"
  echo "Code cloned successfully"
}
