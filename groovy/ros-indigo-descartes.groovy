node {
    git url: "https://github.com/ros-industrial-consortium/descartes.git", branch: "indigo-devel"
    registerROS('ros:indigo-desktop-full', ['ros-indigo-moveit-ros-planning', 'ros-indigo-moveit-kinematics'], ['ros-indigo-moveit-core'])
}
