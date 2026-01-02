node {
    git url: "https://github.com/ros-industrial-consortium/descartes.git", branch: "melodic-devel"
    registerROS('ros:noetic-desktop-full', ['ros-noetic-moveit-ros-planning', 'ros-noetic-moveit-kinematics'], ['ros-noetic-moveit-core'])
}
