package days13;

import days14.Time;

/**
 * @author BongGu
 * @date 2024. 1. 17. - 오전 10:09:26
 * @subject Git 사용법
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

		/*
		 *  0. Git 사용법
   1) 설치
      - git 홈페이지에서 다운
      - 다 기본값으로 주고 설치
   2) New repository
      - gitignore : 
   3) 토큰 만들기
      - Settings > Developer Settings > Psersonal access tokens
      - 토큰 : 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
   4) 깃 폴더 생성
      - E:\Class\Workspace\JavaClass-Home
        > 우리집
      - E:\Class\Workspace\JavaClass-Sist
        > 교육원
   5) 우클릭 > open git bash here 클릭. 폴더 안에서 깃 입력창 실행
   6) 깃 사용자 등록 
      - $ git config --global user.name "원하는 사용자 이름"
      - $ git config --global user.email "원하는 사용자 이메일"
   7) 깃 사용자 확인
      - $ git config user.name
      - $ git config user.email
      - $ git config -l (엘) > 리스트
   8) 원격 저장소 등록되어있는지 확인
      - $ git remote -v > 처음에는 fatal : not a git repository (or any of the parent directories): .git 나옴
   9) 로컬 저장소 생성
      - $ git init > Initialized empty Git repository in E:/Class/Workspace/JavaClass-Sist/.git/
  10) 폴더 내 목록 확인
      - ls
  11) E:\Class\Workspace\JavaClass-Sist 가 로컬 
  12) *.class > 모든 클래스 파일 무시하겠다
      - .gitignore 파일 만들어서 *.class 저장
      - 이클립스 다시 켜서 경로 sist로 바꾸고 하니까 /.metadata/

  13) $ git status //깃 상태 확인하는 명령어
			On branch master //master 브랜치에 있는 상태

			No commits yet //아직 커밋 되지 않음

			Untracked files:  //관리대상이 아닌 것들
  				(use "git add <file>..." to include in what will be committed) //git add 추가한 뒤로 커밋할수 있도록 명령어 사용해라
        				.gitignore
        				Hellojava.java
        				gitPro/

			nothing added to commit but untracked files present (use "git add" to track)
  14) 다시 원격 저장소 확인 -> 원격저장소 등록
      - git remote add origin > 원격 저장소 별칭 주기 (origin) 이라고 명명
        : git remote add origin https://github.com/GuBonHyeok/javaPro.git 라고 추가했음
      - % gir remote -v 로 다시 확인하면 아래가 추가되어있음.
      - origin  https://github.com/GuBonHyeok/javaPro.git (fetch) 가져오기
		origin  https://github.com/GuBonHyeok/javaPro.git (push) 로컬 > 원격으로 집어넣기
  15) Untracked 되어있던 파일들 관리하는 파일로 변환
  16) 스테이징 영역 추가 (git add -h : add에 관한 명령어 출력)
      - git add 파일명
      - git add . >> 모든 것들을 추가하라는 코딩
      - 이후 git status 로 확인해보면 Untracked files 파일들 바뀌어있음
      - Changes to be committed:
  		(use "git rm --cached <file>..." to unstage)
        new file:   .gitignore
        new file:   Hellojava.java
        new file:   gitPro/.classpath
        new file:   gitPro/.gitignore
        new file:   gitPro/.project
        new file:   gitPro/.settings/org.eclipse.jdt.core.prefs
        new file:   gitPro/src/gitPro/Sample.java
      
  17) 로컬 저장소 (git directory) 에 추가 하는 작업
      - git commit -m "first javaPro commit"
         > $ git commit -m "first javaPro commit"
				[master (root-commit) cd50e9d] first javaPro commit
 				7 files changed, 58 insertions(+)
 				create mode 100644 .gitignore
 				create mode 100644 Hellojava.java
 				create mode 100644 gitPro/.classpath
 				create mode 100644 gitPro/.gitignore
 				create mode 100644 gitPro/.project
 				create mode 100644 gitPro/.settings/org.eclipse.jdt.core.prefs
 				create mode 100644 gitPro/src/gitPro/Sample.java
  18) 원격 저장소 (gitHub)에 추가 하는 작업
      - git push --set-upstream origin master
  19) Ex02 파일 생성해서 추가하는 법
      - git add .
      - git commit -m "second Ex02.java add" > 로컬에 Ex02 저장
      - 이클립스 가보면 ? 사라져있음
      - git push origin master 하면 깃허브에 올라감
   20) JavaClass-Sist(교육원) -> 원격 저장소 (깃헙)에 올린 상태
      - 집에 간 후에.. --집--JavaClass-home(집에 있는 폴더라고 가정)
        가. E:\Class\Workspace\JavaClass-Home 폴더로 이동
        나. Home 폴더에서 gitBash 띄워서 Git Repository (깃 로컬 저장소) 생성
           - 만드는 방법은 git init (신규 생성) , git clone (원격 저장소 복제)
           - git clone 으로 깃헙에 있는 거 가져올 예정 
           - $ git clone https://github.com/GuBonHyeok/javaPro.git JavaClass
              > JavaClass 라는 폴더 생성해서 넣어주는 작업
                 Cloning into 'JavaClass'...
				remote: Enumerating objects: 19, done.
				remote: Counting objects: 100% (19/19), done.
				remote: Compressing objects: 100% (12/12), done.
				remote: Total 19 (delta 2), reused 19 (delta 2), pack-reused 0
				Receiving objects: 100% (19/19), done.
				Resolving deltas: 100% (2/2), done.
				
	중요) git config user.name 등록
           git config user.email 등록
           git remote - origin master 원격 저장소 등록
           
    ======== 이클립스 + git 으로하는 방법=======
    1) ㄴ 이클립스 실행
        windows > show view > git repositories > clone a git repositories 클릭. 그대로 로컬에 복사하겠다는 의미
         ㄴ gitPRo 자바프로젝트 생성
    2) gitHub
       - javaPro 원격 저장소 생성
    3) javaPRo 원격 저장소 복제(clone)
    4) https://github.com/GuBonHyeok/javaPro.git 반드시 먼저 복사
       4-1) C:\Users\\user\\git\javaPro 로컬 저장소 설정
             - .git 폴더
             - 원격 저장소로부터 복제한 폴더, 파일
             
    





  
      
      
		 * */
		
		Time t = new Time();
		t.


	} //main

} //class
