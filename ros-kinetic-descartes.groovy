node {
    git url: "https://github.com/ros-industrial-consortium/descartes.git", branch: "kinetic-devel"
    registerROS('ros:kinetic-desktop-full', ['ros-kinetic-moveit-ros-planning', 'ros-kinetic-moveit-kinematics'], ['ros-kinetic-moveit-core'])
}
